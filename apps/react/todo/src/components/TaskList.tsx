type Task = {
  id: string;
  title: string;
}

type TaskListProps = {
  taskList: Task[];
  editTask: (id: string, title: string) => void;
  deleteTask: (id: string) => void;
}

function TaskList({ taskList, editTask, deleteTask }: TaskListProps) {

  return (
    <>
      {taskList.map((task) => {
        return (
          <div key={task.id} className="taskCard">
            <input type="text" value={task.title} onChange={(e) => editTask(task.id, e.target.value)} />
            <button className="deleteButton" onClick={() => deleteTask(task.id)}>×</button>
          </div>
        )
      })}
    </>
  )
}

export default TaskList