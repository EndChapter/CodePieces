<template>
    <div class="container">
        <div class="row">
            <div class="col-md-12">

                <router-view name="header-top"></router-view>
                <transition name="slide" mode="out-in" :duration="500">
                    <router-view></router-view>
                </transition>

                <router-view name="header-bottom"></router-view>
            </div>
        </div>
    </div>
</template>

<script>
import Header from "./components/Header";

export default {
    components:{
        appHeader: Header,
    }
}
</script>

<style>
    .fade-enter{
        opacity: 0;
    }
    .fade-enter-active{
        transition: opacity 1s ;
    }
    .fade-leave{
        opacity: 1;
    }
    .fade-leave-active{
        transition: opacity 1s;
        opacity: 0;
    }
    .slide-enter{
        opacity: 0;
    }
    .slide-enter-active{
        animation: slide-in 1s linear forwards;
        transition: opacity 0.5s;
    }
    .slide-leave{

    }
    .slide-leave-active{
        animation: slide-out 1s linear forwards;
        transition: opacity 3s;
        opacity: 0;
        position: absolute;
    }
    @keyframes slide-in {
        from{
            transform: translateY(20px);
        }
        to{
            transform: translateY(0px);
        }
    }
    @keyframes slide-out {
        from{
            transform: translateY(0px);
        }
        to{
            transform: translateY(20px);
        }
    }
</style>
