import { Component } from "react";

class Demo4 extends Component {
    
    state = { showMsg: false }
    
    renderMsg(show){
        if (show)
            return <p>Hellow warruuuudoo</p>
        else
            return null
    }

    doToggle = () => {
        let isShow = !this.state.showMsg;
        this.setState({showMsg: isShow});
    }


    render() { 
        // const showMsg = false;
        return (
            <div>
                <button onClick={this.doToggle}>Click me to show the rest</button>
                <div>
                    { this.state.showMsg && <p>I am the content that should be hidden by default</p>}
                </div> 
                <div>
                    {this.renderMsg(false)}
                </div>
            </div>
            );
        }
}
 

export default Demo4;
