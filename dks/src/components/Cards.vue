<template>
    <div class="container" style="width: 100%; height: 100%">
        {{selectedCard}}
        <br><br>
        <div class="text-center">
            <h1><strong style="color: #B86053;">Poğaça</strong> <strong style="color :#9A00D6">Nerede</strong> <strong style="color: red">?</strong></h1>
            <br>
            <p style="color: grey; font-size: 125%"><strong>Açık kartlardan birini seçtikten sonra, kapalı karta tıklayınız..</strong></p>
        </div>
        <hr>
        <br><br><br>
        <div class="text-center">
            <div class="container card-group">
                <template v-for="cardAsset in cardAssets">
                    <transition
                            enter-active-class="animate__animated animate__flipInY" appear>
                        <div   :class="cardAsset.clickStatus ? clickShadow: cardAsset.shadowStatus" style="margin: 27px">
                            <img @click="cardClicked(cardAsset.id)"
                                 @mouseover="cardAsset.shadowStatus = 'shadow-lg'"
                                 @mouseleave="cardAsset.shadowStatus = 'shadow-sm'"
                                 :src="'/src/assets/' + cardAsset.src"
                                 class="card-c">
                        </div>
                    </transition>
                </template>
                <br><br>
                <div class="container">
                    <div class="col-sm"></div>
                    <div class="col-sm">
                        <transition
                                enter-active-class="animate__animated animate__flipInY"
                                leave-active-class="animate__animated animate__flipInY"
                                appear>
                            <img :src="'/src/assets/' + back.background"
                                 :class="back.clickStatus ? clickShadow: back.shadowStatus"
                                 @click="resultClicked"
                                 @mouseover="back.shadowStatus = 'shadow-lg'"
                                 @mouseleave="back.shadowStatus = 'shadow-sm'"
                                 class="card-c pos" key="save" v-if="result">

                            <img :src="'/src/assets/' + cardAssets[selectedCard-1].src"
                                 class="card-c pos" key="status"
                            v-else>
                        </transition>
                    </div>

                    <div class="col-sm"></div>
                </div>
            </div>
        </div>
    </div>


</template>

<script>
    export default {
        name: "Cards",
        data(){
            return{
                cardAssets: [
                    {id: 1, src: 'card-1.jpg', shadowStatus: "shadow-sm", clickStatus: false},
                    {id: 2, src: 'card-2.jpg', shadowStatus: "shadow-sm", clickStatus: false},
                    {id: 3, src: 'card-3.jpg', shadowStatus: "shadow-sm", clickStatus: false},
                    {id: 4, src: 'card-4.jpg', shadowStatus: "shadow-sm", clickStatus: false},
                    {id: 5, src: 'card-5.jpg', shadowStatus: "shadow-sm", clickStatus: false},
                ],
                clickShadow: "sh",
                cardAlreadyClicked: false,
                back: {background: "vue-js-egitim-background.jpg", shadowStatus: 'shadow-sm', clickStatus: false,},
                clickedCard: 0,
                selectedCard: 0,
                result: true,
                sonuc: "",
            }
        },
        methods:{
            cardClicked(index){
                if(this.cardAlreadyClicked === false){
                    this.cardAssets[index-1].clickStatus = true;
                    this.cardAlreadyClicked =true;
                    this.clickedCard = index;
                }else{
                    alert('Bir karta zaten tıkladınız. Oyuncuların en fazla 1 karta tıklama hakları vardır...')
                }

            },
            resultClicked(){

                if(this.clickedCard === 0){
                    alert('Lütfen önce bir kart seçiniz...');
                }else{
                    this.back.clickStatus= true;
                    this.result= false;
                    let goster = false;
                    if(this.selectedCard === this.clickedCard){

                        this.sonuc = true;
                        this.$emit('sonuc', this.sonuc);
                        setTimeout(()=>{
                            this.$emit('goster', goster);
                        },1000);


                    }else{
                        this.sonuc = false;
                        this.$emit('sonuc', this.sonuc);
                        setTimeout(()=>{
                            this.$emit('goster', goster);
                        },1000);

                    }
                }
            },
            resultEnter(el){
                el.classList.add('animate__animated animate__flipInY');
            }
        },
        created() {
            this.selectedCard= Math.ceil(Math.random()*5);
        }

    }
</script>

<style scoped>

</style>