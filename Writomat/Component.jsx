import React, { useEffect, useState } from 'react';
import axios from 'axios';

const UserList = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        axios.get('/api/users')
            .then(response => {
                setUsers(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the users!', error);
            });
    }, []);

    return (
        <div>
            <h1>User List</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>
                        <h2>{user.name}</h2>
                        <p>Category: {user.category}</p>
                        <p>Bio: {user.bio}</p>
                        <p>Contact: {user.contact}</p>
                        <a href={user.links}>Visit</a>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default UserList;
