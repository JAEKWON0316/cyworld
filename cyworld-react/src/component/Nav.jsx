import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import dummy from '../db/Data.json'; // Data.json 파일 불러오기

const Nav = ({ setShowPhotoAlbum }) => { 
  const [selectedIndex, setSelectedIndex] = useState(null);
  const click = dummy.nav; // Data.json의 nav 배열 사용

  useEffect(() => {
    const savedIndex = localStorage.getItem('selectedIndex');
    if (savedIndex !== null) {
      setSelectedIndex(parseInt(savedIndex, 10));
      const savedNavId = click[parseInt(savedIndex, 10)]?.id;
      if (savedNavId === 'photo') {
        setShowPhotoAlbum(true);
      } else {
        setShowPhotoAlbum(false);
      }
    }
  }, [click, setShowPhotoAlbum]);

  const handleClick = (index, navId) => {
    setSelectedIndex(index);
    localStorage.setItem('selectedIndex', index);
    if (navId === 'photo') {
      setShowPhotoAlbum(true);
    } else {
      setShowPhotoAlbum(false); 
    }
  };

  return (
    <div className='nav'>
      <ul>
        {click.map((nav, index) => {
          const isSelected = index === selectedIndex;
          return (
            <li
              key={nav.id} // key prop을 <li>에 추가
              onClick={() => handleClick(index, nav.id)} 
              style={{
                backgroundColor: isSelected ? '#fff' : 'rgb(56 142 176)',
                color: isSelected ? '#666' : '#fff'
              }}>
              <Link 
                to={`/${nav.id}`} 
                style={{ color: isSelected ? '#666' : '#fff' }}>
                {nav.nav}
              </Link>
            </li>
          );
        })}
      </ul>
    </div>
  );
};

export default Nav;