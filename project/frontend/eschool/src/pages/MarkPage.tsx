import {columns} from "@/components/marks/Columns";
import {MarkTable} from "@/components/marks/MarkTable";
import gradeService from "@/services/MarkService";


function MarkPage() {

    const data = gradeService;

    return (
        <div className="container mx-auto py-10">
            <MarkTable columns={columns} data={data}/>
        </div>
    );
}

export default MarkPage;