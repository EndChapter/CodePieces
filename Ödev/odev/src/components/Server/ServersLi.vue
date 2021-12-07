<template>
    <div>
        <li class="list-group-item"
            v-for="datas in data"
            @click="emItem">
            Sunucu #id:{{datas.id}} | Durum: {{datas.status}}

        </li>
    </div>
</template>

<script>
    import {eventBus} from "../../main";

    export default {
        props:['data'],
        data: function(){
            return{
                svStatus : 3,
            }
        },
        methods: {
            emItem(){
                eventBus.changeStatus(this.data[this.svStatus].status);
            }
        },
        created() {
          eventBus.$on('id', (id)=>{
              this.svStatus = id;
          })
        },
        watch: {
            svStatus(){
                eventBus.changeStatus(this.data[this.svStatus].status);
            }
        }
    }
</script>

<style scoped>

</style>