<template>
        <transition-group
        enter-active-class="animate__animated animate__backInLeft"
        leave-active-class="animate__animated animate__backOutRight"
        >
            <app-card v-if="goster" @sonuc="sonuc = $event" @goster="goster = $event" key="status"></app-card>
            <components :is="selectedComponent" v-else key="save" @newgame="newGame= $event"></components>
            <canvas id="canvas" v-show="sonuc == true" key="canvas"></canvas>
        </transition-group>
</template>
<script>
import Cards from "./components/Cards";
import Lose from "./components/Lose";
import Win from "./components/Win";

export default {
    data(){
        return{
            sonuc: "",
            goster: true,
            newGame: false,
        }
    },
    components:{
        appCard: Cards,
        appLose: Lose,
        appWin: Win
    },
    computed:{
        selectedComponent(){
            if(this.sonuc=== true){
                return 'appWin';
            }
            else{
                return 'appLose';
            }
        }
    },
    watch :{
        newGame(){
            if(this.newGame === true){
                this.goster = true;
                this.newGame = false;
                this.sonuc = false;
            }
        }
    }
}
</script>
<style>

</style>
