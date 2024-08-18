// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  modules: ['@nuxtjs/tailwindcss', "@nuxt/image"],
  css: ['~/assets/main.css'],
  vite: {
    css: {
      preprocessorOptions: {
        scss: {
          additionalData: '@use "~/assets/style.scss" as *;'
        }
      }
    }
  },
  runtimeConfig: {
    privateRuntimeConfig: {
      baseURL: process.env.BASE_URL || 'http://localhost:3000',

    },
  },
})