type Grade = {
    id: number;
    value: number;
    classId: number;
    studentId: number;
    dateTime: Date;
};

const grades : Grade[] = [
    {
        id: 1,
        value: 3,
        classId: 1,
        studentId: 1,
        dateTime: new Date('2024-01-10T14:30:00'),
    },
    {
        id: 2,
        value: 4,
        classId: 1,
        studentId: 1,
        dateTime: new Date('2024-02-05T09:15:00'),
    },
    {
        id: 3,
        value: 5,
        classId: 1,
        studentId: 1,
        dateTime: new Date('2024-03-12T16:45:00'),
    },
    {
        id: 4,
        value: 1,
        classId: 1,
        studentId: 1,
        dateTime: new Date('2024-04-20T11:00:00'),
    }
    // Add more as needed
];

export default grades;