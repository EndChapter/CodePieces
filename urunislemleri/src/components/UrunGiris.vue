<template>
<div>
    <div class="container">
        <div class="row">
            <div class="col-6 offset-3 pt-3 card mt-5 shadow">
                <div class="card-body">
                    <h3>Ürün İşlemleri</h3>
                    <hr class="hr">
                    <div class="form-group">
                        <label>Ürün Adı</label>
                        <input type="text" class="form-control" placeholder="Ürün adını giriniz.." v-model="prods.urunadi">
                    </div>
                    <div class="form-group">
                        <label>Adet</label>
                        <input type="text" class="form-control" placeholder="Ürün adetini giriniz.." v-model.number="prods.adet">
                    </div>
                    <div class="form-group">
                        <label>Fiyat</label>
                        <input type="text" class="form-control" placeholder="Ürün fiyatı giriniz.." v-model.number="prods.fiyat">
                    </div>
                    <div class="form-group">
                        <label>Açıklama</label>
                        <textarea cols="30" rows="5" placeholder="Ürüne ait bir açıklama giriniz..."
                                  class="form-control" v-model="prods.aciklama"></textarea>
                    </div>
                    <hr class="hr">
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
                prods: {id: this.$store.getters.getProducts.length+1, urunadi: '',adet: '', fiyat: '', aciklama: ''}
            }
        },
        methods:{
            sendProdData(){
                this.$store.dispatch('setDBProds', this.prods)
            }
        }
    }
</script>

<style scoped>

</style>
