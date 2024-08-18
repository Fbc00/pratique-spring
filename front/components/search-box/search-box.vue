<template>
    <form class="search-box shadow-md rounded-lg px-4 py-3 flex justify-around items-end gap-4 bg-white flex-col md:flex-row mx-2">
        <div class="flex flex-col flex-auto w-full">
            <label for="input-sport" class="text-color4 text-md font-semibold">Modalidade</label>
            <select type="select" id="input-sport" class=" p-2 rounded-lg border-2  focus:border-color2 focus:outline-none bg-white cursor-pointer"  
                placeholder="Modalidade"
                v-model="sport"
            >
                <option value="volei">Vôlei</option>
                <option value="futebol">Futebol</option>
                <option value="tenis">Tênis</option>
                <option value="basket">Basquete</option>
                <option value="carro">Carro</option>
            </select>
        </div>
        <div class="flex flex-col flex-auto w-full"> 
            <label for="input-date" class="text-color4 text-md font-semibold">Data</label>
            <input type="date" id="input-date" class="p-2 rounded-lg border-2  focus:border-color2 focus:outline-none" placeholder="Date" v-model="date">
        </div>
        <button class="text-color4 text-md font-semibold p-2 rounded-lg bg-color2 hover:opacity-75 flex-auto min-h-11 w-full" type="submit" 
        @click.prevent="search"
        >
            Buscar
        </button>
    </form>
</template>

<script setup lang="ts">
import type { ModelRef } from 'vue';


const router = useRouter()
const sport: ModelRef<string> = defineModel('sport', { type: String, default: '' })
const date: ModelRef<string> = defineModel('date', { type: String, default: '' })


const search = async () => {
    const query = {
        ida: date.value,
    }
    await router.push( { name: 'searchResult', query, params: { id: sport.value } })
    
}

</script>