
import './App.css';

import { AuthProvider } from './components/context/AuthContext';
import { Routes,BrowserRouter as Router,Route, Navigate } from 'react-router-dom';
import Home from './components/home/Home';
import PrivateRoute from './components/misc/PrivateRoute';
import Login from './components/home/Login';
import Signup from './components/home/Signup';
import Navbar from './components/misc/Navbar';
import AdminPage from './components/admin/AdminPage';
import UserPage from './components/user/UserPage';


function App() {
  return (
    <AuthProvider>
    <Router>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/login' element={<Login />} />
        <Route path='/signup' element={<Signup />} />
        <Route path="/adminpage" element={<PrivateRoute><AdminPage /></PrivateRoute>}/>
        <Route path="/userpage" element={<PrivateRoute><UserPage /></PrivateRoute>}/>
        <Route path="*" element={<Navigate to="/" />}/>
      </Routes>
    </Router>
  </AuthProvider>
  );
}

export default App;
