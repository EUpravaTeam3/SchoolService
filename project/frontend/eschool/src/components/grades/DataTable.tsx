import {ColumnDef} from "@tanstack/react-table";

function Table() {
    return (
        <>
        </>
    );
}

interface DataTableProps<TData, TValue> {
    columns: ColumnDef<TData, TValue>[]
    data: TData[]
}

export function Table<TData, TValue>({}:

