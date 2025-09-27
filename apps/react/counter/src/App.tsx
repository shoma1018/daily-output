import {useState} from 'react';
import './App.css'
import CounterControls from './components/CounterControls';
import CounterDisplay from './components/CounterDisplay';

function App() {
  const [count, setCount] = useState(0);
  
  const countUp = () => {
    setCount(prev => prev + 1);
  }

  const countDown = () => {
    setCount(prev => prev - 1);
  }

  const reset = () => {
    setCount(0);
  }

  return (
    <>
      <CounterDisplay count={count} />
      <CounterControls countUp={countUp} countDown={countDown} reset={reset} />
    </>
  )
}

export default App
