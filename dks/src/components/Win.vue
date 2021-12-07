<template>

    <div class="body">

        <h1>Tebrikler Bildiniz!!!</h1>
        <button class="button" @click="newGameClicked">Yeni Oyun</button>
    </div>
</template>

<script>
    export default {
        data(){
            return{
                newGame: false,
            }
        },
        methods:{
            newGameClicked(){
                this.newGame = true;
                this.$emit('newgame', this.newGame)
            },
        }
    }
</script>

<style scoped>
    .body{
        position: absolute;
        top: 0px;
        left: 0px;
        width: 100% !important;
        height: 100% !important;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        background-size: 100% !important;

    }
    .body h1{
        text-align: center;
        font-size: 333%;
        color: darkgreen;
        opacity: .5;
    }
    .body button{
        width: 200px;
        background-color: #fff;
        color: darkred;
        border: 1px solid darkgreen;
        height: 50px;
        font-size: 15px;
        border-radius: 5px;
        outline: none;
    }
    .body button:hover{
        background-color: darkgreen;
        color: #fff;
        transition: all 0.5s;
    }

</style>