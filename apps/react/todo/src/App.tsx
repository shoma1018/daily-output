import {useState, useEffect} from 'react';
import './App.css';
import TaskForm from './components/TaskForm';
import TaskList from './components/TaskList';

type Task = {
  id: string;
  title: string;
}

function App() {

  const [taskList, setTaskList] = useState<Task[]>([]);

  useEffect(() => {
    const stored = localStorage.getItem('taskList');
    if (stored) {
      setTaskList(JSON.parse(stored));
    }
  }, [])

  useEffect(() => {
    const saved = JSON.stringify(taskList);
    localStorage.setItem('taskList', saved);
  }, [taskList]) 

  function addTask() {
    const task: Task = {
      id: crypto.randomUUID(),
      title: ""
    }
    setTaskList([...taskList, task]);
  }

  function editTask(id: string, title: string) {
    const newTaskList = taskList.map((task) => task.id === id ? {...task, title} : task);
    setTaskList(newTaskList);
  }

  function deleteTask(id: string) {
    const newTaskList = taskList.filter((task) => task.id !== id);
    setTaskList(newTaskList);
  }

  return (
    <>
      <h1>TODOリスト</h1>
      <TaskForm addTask={addTask} />
      <TaskList taskList={taskList} editTask={editTask} deleteTask={deleteTask}/>
    </>
  )
}

export default App
