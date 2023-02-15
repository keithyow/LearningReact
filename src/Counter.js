import { Component } from "react";

class Counter extends Component{
    constructor(props){
        super(props);
        this.state = {counter: 0};
        this.increment = this.increment.bind(this);
        this.decrement = this.decrement.bind(this);
        
    }


    increment() {
        let count = this.state.counter;
        count ++;
        this.setState({counter: count});
        console.log('test', this.state.counter);
    }

    decrement() {
        let count = this.state.counter;
        count --;
        this.setState({counter: count});
        console.log('test', this.state.counter);
    }
    render(){
        return(
            <p>
                Number: {this.state.counter} <br />
                <button onClick={this.increment}>Increment</button>
                <button onClick={this.decrement}>Decrement</button>
            </p>
        );
    }
}

export default Counter;