// This is a component

function Hello(props){
    return (
        <div>
            <p>Hello</p>
            {/* inline styling */}
            <p style = {{color: 'green'}}> Lorem ipsum  </p>
            <button onClick={() => alert("You clicked me! SIKE!")}>CLICK ME PLEASE!!! {props.text}</button>
        </div>
    )
}

export default Hello;