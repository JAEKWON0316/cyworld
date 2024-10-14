import React, { useEffect, useState } from 'react';
import axios from 'axios';

const DiaryList = () => {
    const [diaries, setDiaries] = useState([]);

    useEffect(() => {
        fetchDiaries();
    }, []);

    const fetchDiaries = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/diaries'); // API 호출
            console.log("Fetched diaries:", response.data); // 응답 데이터 확인
            setDiaries(response.data); // 상태 업데이트
        } catch (error) {
            console.error("Error fetching diaries:", error);
        }
    };

    return (
        <div>
            <h2>다이어리 목록</h2>
            <ul>
                {diaries.length > 0 ? (
                    diaries.map(diary => (
                        <li key={diary.id}>{diary.content}</li> // 다이어리 내용 출력
                    ))
                ) : (
                    <p>다이어리가 없습니다.</p> // 데이터가 없을 때 메시지 표시
                )}
            </ul>
        </div>
    );
};

export default DiaryList;
