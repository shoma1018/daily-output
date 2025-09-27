type CounterControlsProps = {
    countUp: () => void;
    countDown: () => void;
    reset: () => void;
  }

function CounterControls({ countUp, countDown, reset }: CounterControlsProps) {

  return (
    <>
      <button onClick={countUp}>+</button>
      <button onClick={countDown}>-</button>
      <button onClick={reset}>reset</button>
    </>
  )
}

export default CounterControls