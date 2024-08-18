enum ApiMethod {
    GET = 'GET',
    POST = 'POST',
    PUT = 'PUT',
    DELETE = 'DELETE',
}
type DataRequest = string | object | null | number | boolean | undefined

type ApiRequest = {
    url: string,
    options?: {
        method: ApiMethod,
        body?: DataRequest,
    }

}

export const searchEvents = async (data: DataRequest): Promise<ApiRequest> => {
    return {
        url: 'api/events',
        options: {
            method: ApiMethod.GET,
            body: data,
        }
    }
}