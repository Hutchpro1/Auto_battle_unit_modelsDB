import './App.css';
import Login from './pages/Login';
import Game from './pages/Game';
import LeaderBoard from './pages/LeaderBoard';
import UnitData from './pages/UnitData';
import Header from './componets/Header';
import { render } from '@testing-library/react';

function App() {

  let userName

  let pageState = 'unit'
  let page

  updatePage(pageState)

  return (
    <div className="App">
      <Header  State={pageState} Update={updatePage} />
      {page}
    </div>
  );

  function updatePage(state) {
    if(state === 'login') {
      page = <Login State={pageState} LoginName={userName} />
      console.log('loginPage')
    }
    else if (state === 'game') {
      page = <Game State={pageState} LoginName={userName} />
      console.log('gamePage')
    }
    else if (state === 'leader') {
      page = <LeaderBoard State={pageState} LoginName={userName} />
      console.log('leaderPage')
    }
    else if (state === 'unit') {
      page = <UnitData State={pageState} LoginName={userName} />
      console.log('unitPage')
    }
  }
}

export default App;
