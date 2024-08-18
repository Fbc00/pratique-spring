

<template> 
    <div class="card-event shadow-md rounded-lg p-4 ">
      <div  class="card-header flex justify-between items-center">
         <span class="text-xl font-semibold ">{{ event.modalidade }}</span>
         <span class="text-sm text-color4 cursor-pointer"
         @click="clipboard(event.id)">
         #{{ event.id }}</span>
      </div>
     <div class="card-body flex justify-between gap-">
         
      <div class="flex flex-col">
         <span >
            <b>Date:</b> {{ event.date }}
         </span>
         <span >
            <b>Time:</b> {{ event.time }}
         </span>
      </div>
      <div class="flex flex-col">
         <span >
            <b>Place:</b> {{ event.price }}
         </span>
         <span >
            <b>Location:</b> <a :href="event.location.link" target="_blank">{{ event.location.name }}</a>
         </span>
      </div>   
     </div>

     <button class="card-footer  text-white text-sm p-3 rounded bg-rose-950 hover:opacity-75 font-semibold w-full">
        Selecionar
     </button>
   </div> 
</template>


<script setup lang="ts">

const router = useRouter()
defineProps({
    event: {
        type: Object,
        default: () => {
            return {
                id: 1,
                name: 'Event 1',
                description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
                image: 'https://st2.depositphotos.com/1518767/7635/i/450/depositphotos_76353721-stock-photo-friends-playing-volleyball.jpg',
                date: '2022-01-01',
                time: '10:00',
                place: 'Place 1',
                location: {
                  link: 'https://www.google.com',
                  name: 'Location 1',
                },
                modalidade: 'Vôlei',
                price: 'R$ 100',
            }
        }
}})


const clipboard = (id: number) => {
   const text= window.location.origin + '/event/' + id
   navigator.clipboard.writeText(text)
   alert('Link copiado!')

}

</script>