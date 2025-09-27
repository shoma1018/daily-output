type TaskFormProps = {
  addTask: () => void;
}

function TaskForm({ addTask }: TaskFormProps) {
  
  return (
    <button onClick={addTask}>追加</button>
  )
}

export default TaskForm