<template>
<div>
    <div class="container">
        <div class="row">
            <div class="col-6 offset-3 pt-3 card mt-5 shadow">
                <div class="card-body">
                    <h3>Ürün İşlemleri</h3>
                    <hr>
                    <div class="form-group">
                        <label>Ürün Adı</label>
                        <input type="text" class="form-control" placeholder="Ürün adını giriniz.." v-model="prods.urunadi">
                    </div>
                    <div class="form-group">
                        <label>Adet</label>
                        <input type="number" class="form-control" placeholder="Ürün adetini giriniz.." v-model.number="prods.adet">
                    </div>
                    <div class="form-group">
                        <label>Fiyat</label>
                        <input type="number" class="form-control" placeholder="Ürün fiyatı giriniz.." v-model.number="prods.fiyat">
                    </div>
                    <div class="form-group">
                        <label>Açıklama</label>
                        <textarea cols="30" rows="5" placeholder="Ürüne ait bir açıklama giriniz..."
                                  class="form-control" v-model="prods.aciklama"></textarea>
                    </div>
                    <hr>
                    <button class="btn btn-primary" @click.prevent="sendProdData">Kaydet-+</button>
                </div>
            </div>
        </div>
    </div>
</div>
</template>

<script>
    export default {
        data(){
            return{
                prods: {id: 0, urunadi: '',adet: '', fiyat: '', aciklama: '', satisFiyati: 0, satisAdeti: 0},
                saveButtonClicked: false,
            }
        },
        methods:{
            sendProdData(){
                this.saveButtonClicked= true;
                this.prods.id = this.$store.getters.getProducts.length;
                this.$store.commit('setProducts', this.prods);
                this.$store.dispatch('setDBProds', this.prods);
                this.$router.replace('/');
            },
        },
        beforeRouteLeave(to, from, next){
            if((this.prods.urunadi.length>0 || this.prods.adet>0 || this.prods.fiyat>0 || this.prods.aciklama.length>0)&& !this.saveButtonClicked){
                if(confirm('Kaydedilmemiş değişiklikler var devam etmek istiyor musunuz?')){
                    next();
                }else{
                    next(false);
                }
            }else{
                next();
            }
        }
    }
</script>

<style scoped>

</style>
