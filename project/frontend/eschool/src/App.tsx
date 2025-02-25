import './App.css'
import { Button } from './components/ui/button';
import Navigation from "./components/navigation/Navigation";
import MarkPage from "@/pages/MarkPage";


function App() {


  return (
    <>
        <Navigation></Navigation>
        <MarkPage></MarkPage>
        {/*<h1 className='text-5xl text-center p-16'>Test</h1>*/}
        {/*<Button variant="default">Button</Button>*/}
        {/*<Button variant="milos">Button</Button>*/}
    </>
  )
}

export default App
