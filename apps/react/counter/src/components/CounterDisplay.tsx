type CounterDisplayProps = {
    count: number;
  }

function CounterDisplay({ count }: CounterDisplayProps) {

  return (
    <>
      <h1>{count}</h1>
    </>
  )
}

export default CounterDisplay