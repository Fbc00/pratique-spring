export default [
  {
    path: '/',
    name: 'home',
    component: () => import('~/pages/home.vue'),
  },
  {
    path: '/sport/:id',
    name: 'searchResult',
    component: () => import('~/pages/search-result.vue'),
  }

]