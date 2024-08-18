<template>
    <div v-if="options.length > 0"
         class="overflow-auto overscroll-x-auto text-lg font-semibold p-4 grid grid-cols-1 grid-flow-col gap-5">
        <span v-for="option in options" 
            :key="option.id" 
            class="to-option cursor-pointer hover:underline" 
            @click="$emit('change', option.id)"
        >
            {{ option.name }}
        </span>
    </div>
</template>
<script setup lang="ts">

defineEmits(['change'])

interface Option {
    id: number,
    name: string
}
defineProps({
    options: {
        type: Array<Option>,
        default: () => []
    }   
})

</script>

<style scoped lang="scss">
.to-option {
    color: $color3;
    &:hover {
        opacity: 0.8;
        text-decoration: underline;
    }
}
</style>