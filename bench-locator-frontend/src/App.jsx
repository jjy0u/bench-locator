import './App.scss';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Nav from './components/Nav/Nav';
import Main from './components/Main/Main';
import BenchOverview from './pages/BenchOverview/BenchOverview';
import AddBench from './pages/AddBench/AddBench';

import { useEffect, useState } from 'react'
const App = () => {

  const [benches, setBenches] = useState([])


  const getBenches = async () => {
    const url = "http://localhost:8080/benches";
    const res = await fetch(url);
    const data = await res.json();
    setBenches(data)
  };

  useEffect(() => {
    getBenches()
  }, [])


  return (
    <Router>
      <div className="App">
        <Nav/>
        <Routes>
          <Route 
            path='/bench/add-bench' 
            element={<AddBench 
            />} 
          />
          <Route 
            path='/bench/:benchId' 
            element={<BenchOverview 
            benchArr = {benches}
            />} 
          />
          <Route
            path = '/'
            element={<Main
            benchArr = {benches}
            />}
          />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
