import './App.css';
import Login from './pages/Login';
import Game from './pages/Game';
import LeaderBoard from './pages/LeaderBoard';
import UnitData from './pages/UnitData';
import ItemData from './pages/ItemData';
import CreateAccount from './pages/CreateAccount'; 
import { useState } from 'react';
import axios from 'axios';

function App() {

  const [page, setPage] = useState([]);
  const [user, setUser] = useState([]);

  const getUnitDataAPI = 'UnitData.json'
  const [unitData, setUnit] = useState([]);

  function getUnitData() {
    axios.get(getUnitDataAPI).then(updateUnitData);
  }

  function updateUnitData(response) {
    setUnit(response.data.units);
    console.log(response.data.units)
  }

  return (
    <div className="App">
      <div id='NavBody'>
        <span id='Nav'><button onClick={login}>Login</button></span>
        <span id='Nav'><button onClick={Create}>Create Account</button></span>
        <span id='Nav'><button onClick={game}>Game</button></span>
        <span id='Nav'><button onClick={unit}>Unit Data</button></span>
        <span id='Nav'><button onClick={item}>Item Data</button></span>
        <span id='Nav'><button onClick={leader}>LeaderBoard</button></span>
      </div>
      <div id='CurrentPage'>{page}</div>
    </div>
  );

  function login() {
    setPage(<Login user={user} setUser={setUser} />)
  }

  function Create() {
    setPage(<CreateAccount />)
    getUnitData()
  }

  function game() {
    setPage(<Game />)
  }

  function unit() {
    getUnitData()
    console.log(unitData)
    setPage(<UnitData unitData={unitData} />)
  }

  function item() {
    setPage(<ItemData />)
  }

  function leader() {
    setPage(<LeaderBoard />)
  }
}

export default App;
