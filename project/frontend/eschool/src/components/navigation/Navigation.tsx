import {
    NavigationMenu, NavigationMenuContent,
    NavigationMenuItem,
    NavigationMenuLink,
    NavigationMenuList, NavigationMenuTrigger,
} from "../ui/navigation-menu";
import {cn} from "../../lib/utils"; // or wherever your base menu is

function Navigation() {
    return (
        <nav className="w-full flex items-center justify-between p-4">
            <div className="text-2xl font-bold">e-school</div>

            <NavigationMenu className="w-full">
                <NavigationMenuList className="flex-1 justify-end">
                    {/* Dropdown for "Change service" */}
                    <NavigationMenuItem>
                        <NavigationMenuTrigger className="text-2xl font-bold">
                            Change service
                        </NavigationMenuTrigger>

                        <NavigationMenuContent>
                            <ul className="grid w-[300px] gap-3 p-4 md:w-[400px]">
                                <li>
                                    <NavigationMenuLink
                                        href="#"
                                        className={cn(
                                            "block select-none rounded-md p-3 no-underline outline-none transition-colors",
                                            "hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground"
                                        )}
                                    >
                                        <div className="text-xl font-bold leading-none">
                                            e-school
                                        </div>
                                        <p className="line-clamp-2 text-base leading-snug text-muted-foreground">
                                            Online platform for primary and secondary students, offering interactive lessons, progress tracking, and teacher support.
                                        </p>
                                    </NavigationMenuLink>
                                </li>
                                <li>
                                    <NavigationMenuLink
                                        href="#"
                                        className={cn(
                                            "block select-none rounded-md p-3 no-underline outline-none transition-colors",
                                            "hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground"
                                        )}
                                    >
                                        <div className="text-xl font-bold leading-none">
                                            e-college
                                        </div>
                                        <p className="line-clamp-2 text-base leading-snug text-muted-foreground">
                                            A digital campus for higher education, streamlining course registration, virtual classrooms, and collaborative study tools.
                                        </p>
                                    </NavigationMenuLink>
                                </li>
                                <li>
                                    <NavigationMenuLink
                                        href="#"
                                        className={cn(
                                            "block select-none rounded-md p-3 no-underline outline-none transition-colors",
                                            "hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground"
                                        )}
                                    >
                                        <div className="text-xl font-bold leading-none">
                                            e-employment
                                        </div>
                                        <p className="line-clamp-2 text-base leading-snug text-muted-foreground">
                                            A job portal that connects job seekers with employers, featuring advanced search options, application tracking, and career advice.
                                        </p>
                                    </NavigationMenuLink>
                                </li>
                                <li>
                                    <NavigationMenuLink
                                        href="#"
                                        className={cn(
                                            "block select-none rounded-md p-3 no-underline outline-none transition-colors",
                                            "hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground"
                                        )}
                                    >
                                        <div className="text-xl font-bold leading-none">
                                            e-business
                                        </div>
                                        <p className="line-clamp-2 text-base leading-snug text-muted-foreground">
                                            A specialized service from the Serbian Business Registers Agency (APR), providing user-friendly business registration, training, and compliance resources.
                                        </p>
                                    </NavigationMenuLink>
                                </li>
                            </ul>
                        </NavigationMenuContent>
                    </NavigationMenuItem>

                    {/* Logout (no dropdown) */}
                    <NavigationMenuItem>
                        <NavigationMenuLink className="text-2xl font-bold cursor-pointer">
                            Logout
                        </NavigationMenuLink>
                    </NavigationMenuItem>
                </NavigationMenuList>
            </NavigationMenu>
        </nav>
    )
}

export default Navigation;