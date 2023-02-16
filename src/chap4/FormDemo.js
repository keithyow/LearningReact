import { useRef, useState } from "react";

function FormDemo() {
    const [tasks, setTasks] = useState([]);
    const [refresh, setRefresh] = useState(null);    
    const taskRef = useRef();

    function saveData(){
        let arr = tasks;
        arr.push(taskRef.current.value);
        setTasks(arr);
        console.log(tasks);
        setRefresh(taskRef.current.value);
    }

    function showTable(){
        return(
            <table className="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td>No</td>
                            <td>Value</td>
                        </tr>
                    </thead>
                    <tbody>
                        {tasks.map((num,index) => (
                            <tr key = {index}>
                                <td>{index}</td>
                                <td>{num}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
        )
    }

    return ( 
        <div className="container">
            <input type="text" ref={taskRef} className ='form-control' />
            <button onClick={saveData} className = 'btn btn-primary'>Save</button>
            <hr />
            {refresh && showTable()}
        </div>
     );
}

export default FormDemo;