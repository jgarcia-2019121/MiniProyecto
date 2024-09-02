import React, { useState } from 'react';

function AgeChecker() {
    const [age, setAge] = useState('');
    const [message, setMessage] = useState('');

    const handleCheckAge = async () => {
        const response = await fetch(`http://localhost:8080/api/age/check?age=${age}`);
        const result = await response.text();
        setMessage(result);
    };

    return (
        <div className="age-checker">
            <h2>Check if you're an adult</h2>
            <input
                type="number"
                value={age}
                onChange={(e) => setAge(e.target.value)}
                placeholder="Enter your age"
            />
            <button onClick={handleCheckAge}>Check</button>
            <p>{message}</p>
        </div>
    );
}

export default AgeChecker;
