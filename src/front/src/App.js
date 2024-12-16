import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function selectData(){
  axios.post('/testData', {'usrId':'admin','passWd':'1234'})
      .then(function (res){
          console.log(res)
          alert(res.data['usrNm']+"디비접속테스트")
      });
}

function App() {
  return (
    <div className="App">
        <header className="App-header">
            <img src={logo} className="App-logo" alt="logo"/>
            <p>
                Edit <code>src/App.js</code> and save to reload.
            </p>
            <button onClick={() => selectData()}>조회</button>
        </header>
    </div>
  );
}

export default App;
