<template> 
    <main class="pt-20">
        <search-box />
        <div class="w-100 grid md:grid-cols-2 xl:grid-cols-4 gap-5">
            <card-event v-for="x in 10" :key="x" />
        </div>
    </main>
</template>

<script setup lang="ts">
import CardEvent from '../card-event/card-event.vue';
import SearchBox from '../search-box/search-box.vue';

</script>