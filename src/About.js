import { Component } from "react";

class About extends Component{
    constructor(props){
        super(props);
    }

    render(){
        const {text, laugh} = this.props;
        return (
        <p>
            <p>{text} {laugh}</p>
            <strong>Name: Me uwu</strong>
            <hr />
            <strong>Email: uwume@daddy.com</strong>
        </p>)
    };
}

export default About;