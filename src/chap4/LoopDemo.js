import Demo4Func from './Demo4Func';

function LoopDemo() {

    function demo(){
        let arr = [1,2,3,4,5];
        arr.forEach((num) => console.log(num));
    }
    const arr = [1,2,3,4,5];

    return (  
        <div>
            {arr.map((num, index) => 
            <p key = {index}>
                Hekkiw
                <Demo4Func />
            </p>)}



            {demo()}
        </div>
    );
}

export default LoopDemo;