import {ColumnDef} from "@tanstack/react-table";

export type Mark = {
    id: number;
    value: number;
    classId: number;
    studentId: number;
    dateTime: Date;
}

export const columns: ColumnDef<Mark>[] = [
    {
        accessorKey: "id",
        header: "Mark id",
    },
    {
        accessorKey: "value",
        header: "Mark value",
    },
    {
        accessorKey: "classId",
        header: "Mark class",
    },
    {
        accessorKey: "date",
        header: "Date",
        cell: ({ row }) => {
            const date: Date = row.original.dateTime;
            return date.toLocaleDateString("en-GB"); // Outputs: 10/01/2024
        },
    },
    {
        accessorKey: "time",
        header: "Time",
        cell: ({ row }) => {
            const date: Date = row.original.dateTime;
            return date.toLocaleTimeString("en-GB", {
                hour: "2-digit",
                minute: "2-digit",
                second: "2-digit",
                hour12: false,
            });
        }
    }
];