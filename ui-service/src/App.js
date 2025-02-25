import { useEffect, useState } from 'react';
import './App.css';

function App() {
  const [metrics, setMetrics] = useState('');
  const [deployments, setDeployments] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/metrics')  
      .then(res => res.text())
      .then(setMetrics)
      .catch(console.error);

    fetch('http://localhost:8080/api/deployments') 
      .then(res => res.json())
      .then(setDeployments)
      .catch(console.error);
  }, []);

  return (
    <div className="dashboard">
      <header className="header">
        <h1>🚀 DevOps Deployment Dashboard</h1>
      </header>

      <section className="metrics-card">
        <h2>📊 System Metrics</h2>
        <p>{metrics || "Loading metrics..."}</p>
      </section>

      <section className="deployments-container">
        <h3>📦 Recent Deployments</h3>
        <div className="table-wrapper">
          <table>
            <thead>
              <tr>
                <th>Application</th>
                <th>Environment</th>
                <th>Status</th>
                <th>Duration</th>
              </tr>
            </thead>
            <tbody>
              {deployments.length > 0 ? (
                deployments.map((d, i) => (
                  <tr key={i}>
                    <td>{d.application}</td>
                    <td>{d.environment}</td>
                    <td className={`status ${d.status.toLowerCase()}`}>
                      {d.status}
                    </td>
                    <td>{d.duration}s</td>
                  </tr>
                ))
              ) : (
                <tr>
                  <td colSpan="4">No deployments found.</td>
                </tr>
              )}
            </tbody>
          </table>
        </div>
      </section>
    </div>
  );
}

export default App;
