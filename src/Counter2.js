import { useState } from "react";

function Counter2() {
    
    const [counter, setCounter] = useState(0);

    const increment = function () {
        let count = counter;
        count++;
        setCounter(count);
        
    };

    const decrement =  function () {
        let count = counter;
        count--;
        setCounter(count);
    }
    
    
    
    return (
        <p>
            Counter: { counter } <br />
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
        </p>
    );

}

export default Counter2;