import { useRef, useState } from "react";

function InvesmentCalculator() {
    const startYear = 2022;
    const amountRef = useRef();
    const yearsRef = useRef();
    const profitRef = useRef();
    const [refresh, setRefresh] = useState(false);
    const [amount, setAmount] = useState([]);


    function generateInvestment(){
        let inAmount = parseInt(amountRef.current.value);
        let yearAmount = parseInt(yearsRef.current.value);
        let profitAmount = parseInt(profitRef.current.value);

        let inv = [];

        let currentYear = startYear;
        let startAmount = inAmount;

        for(let i = 0; i < yearAmount; i++){
            
            let totalProfit = (startAmount * profitAmount /100);
            
            let yearResult = {invest: startAmount, year: currentYear, profit: totalProfit};
            
            inv.push(yearResult);

            startAmount += totalProfit;
            currentYear += 1;

        }
        setAmount(inv);

        setRefresh(true);
    }

    return (
        <div>
            Investment Amount: <input type= 'text' ref = {amountRef}/>
            Number of Years: <input type= 'text' ref = {yearsRef}/>
            Profit Rate (%): <input type= 'text' ref = {profitRef}/>

            <button onClick={generateInvestment}>Generate</button>

            {refresh && (
                <table className="table">
                    <thead>
                        <tr>
                            <td>Year</td>
                            <td>Investment Amount</td>
                            <td>Profit</td>
                        </tr>  
                    </thead>
                    <tbody>
                        {amount.map((amount, index)=>
                            <tr key = {index}>
                                <td>{amount.year}</td>
                                <td>{amount.invest}</td>
                                <td>{amount.profit}</td>
            
                            </tr>
                        )}
                    </tbody>
                </table>
            )}
        </div>
      );
}

export default InvesmentCalculator;