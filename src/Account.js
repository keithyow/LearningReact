import { Component } from "react";

class Account extends Component {
    state = {  } 

    constructor(props){
        super(props);
        this.state = {
            username: '',
            pass: '',
            passCon: '',
            email: '',
            errors: []
        }
        this.validateUsername = this.validateUsername.bind(this);
        this.validatePass = this.validatePass.bind(this);
        this.validatePassCon = this.validatePassCon.bind(this);
        this.validateEmail = this.validateEmail.bind(this);

        this.submitForm = this.submitForm.bind(this);
    }

    submitForm(event){
        console.log(this.state);
    }

    validateUsername (event){
        // console.log(event.target.value);
        let value = event.target.value;
        if(value === ''){
            let errors = this.state.errors;
            errors.push('username cannot be empty');
            this.setState(errors);
        }

        this.setState({username: value})
    }

    validatePass (event){
        console.log(event.target.value);
        let value = event.target.value;
        this.setState({pass: value})
    }

    validatePassCon(event){
        console.log(event.target.value);
        let value = event.target.value;
        this.setState({passCon: value})
    }

    validateEmail(event){
        console.log(event.target.value);
        let value = event.target.value;
        this.setState({email: value})
    }



    render() { 
        return (
            <div className = "app">
                {this.state.errors.map((err) =>( 
                    <p>{err}</p>
                    ))
                }
                Username: <input type= 'text' onBlur={this.validateUsername}/> <br />
                Password: <input type= 'text' onBlur={this.validatePass}/> <br />
                Password Confirmation: <input type= 'text' onBlur={this.validatePassCon}/> <br />
                Email: <input type= 'text'onBlur={this.validateEmail}/> <br />
                <button onClick={this.submitForm}>Submit</button>
            </div>
        );
    }
}
 
export default Account;