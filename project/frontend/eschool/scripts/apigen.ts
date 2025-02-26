import { createClient } from "@hey-api/openapi-ts";

async function generateClient() {
    try {
        await createClient({
            input: "./src/docs/swagger.json",
            output: "./src/api",
            plugins: ['@hey-api/client-fetch'],
        });
    } catch (e) {
        console.error("Error generating API client", e);
    }
}

generateClient();
