import type { RouterConfig } from '@nuxt/schema'
import routes from './routes'

export default <RouterConfig>{
  // https://router.vuejs.org/api/interfaces/routeroptions.html#routes
  routes: (_routes) => routes
}
