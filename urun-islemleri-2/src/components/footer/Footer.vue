<template>
    <div>
        <nav class="navbar fixed-bottom  navbar-light" style="background-color: #e3f2fd;">
            <span class="navbar-text mr-auto">
                <strong>vuejsegitim.com</strong> | gkandemir
            </span>
                    <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
                <strong>Alış Tutarı : </strong>
                <span class="badge badge-danger">{{purchase | currency}}</span>
            </span>
                    <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
                <strong>Satış Tutarı : </strong>
                <span class="badge badge-success">{{selled | currency}}</span>
            </span>
                    <span class="navbar-text navbar-nav my-2 my-lg-0">
                <strong>Bakiye : </strong>
                <span class="badge badge-primary">{{remainder | currency}}</span>
            </span>
        </nav>
    </div>
</template>

<script>
    export default {
        data(){
            return{
                purc: 0,
                rem: 0,
                sell: 0,
            }
        },
        computed:{
            remainder(){
                for(let x = 0; x<this.$store.getters.getProducts.length;x++){
                    this.rem -= ((this.$store.getters.getProducts[x].fiyat * this.$store.getters.getProducts[x].adet) - (this.$store.getters.getProducts[x].satisFiyati * this.$store.getters.getProducts[x].satisAdeti));
                }
                return this.rem + ',00 TL';
            },
            purchase(){
                for(let x = 0; x<this.$store.getters.getProducts.length;x++){
                    this.purc -= (this.$store.getters.getProducts[x].fiyat * this.$store.getters.getProducts[x].adet);
                }
                return this.purc + ',00 TL';
            },
            selled(){
                for(let x = 0; x<this.$store.getters.getProducts.length;x++){
                    this.sell += (this.$store.getters.getProducts[x].satisFiyati * this.$store.getters.getProducts[x].satisAdeti);
                }
                return this.sell + ',00 TL';
            }
        },
    }
</script>

<style scoped>

</style>
