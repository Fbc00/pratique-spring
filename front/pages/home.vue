<template>
<div class="home mx-auto pt-16 flex flex-col items-center justify-center">
    <search-box class="container mx-auto my-auto" />
</div>

</template>



<script setup lang="ts">
useHead({title: 'Pratique - Aqui você encontra o esporte que combina com você hoje.', meta: [{name: 'description', content: 'Pratique o que quiser'}]})
import SearchBox from '~/components/search-box/search-box.vue'

</script>

<style scoped>
.home {
    background-image: url('~/assets/images/ferramentas-esportivas(1).jpg');
    background-size: cover;
    background-position: center;
    height: 100vh;
}
</style>