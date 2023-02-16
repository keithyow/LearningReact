import { useState } from "react";

function Demo4Func() {
    const [showMsg, setShowMsg] = useState(false);

    function doToggle(){
        setShowMsg(!showMsg);
    }

    return ( 
        <div>
            <button onClick={doToggle}>Click me to {showMsg ? 'hide' : 'show'} the rest</button>
            <div>
                { showMsg && <p>I am the content that should be hidden by default</p>}
            </div>
        </div>
     );
}

export default Demo4Func;