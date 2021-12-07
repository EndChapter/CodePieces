<template>
<div>
    <div class="container">
        <div class="same">
            <div class="rect kucult">
                <div class="rect-body">
                    <h3>Ürün Çıkışı</h3>
                    <hr>
                    <form action="">
                        <div class="frmg">
                            <label>Ürün Adı</label>
                            <select class="fc" v-model="selectedProduct" >
                                <option disabled selected>Lütfen bir ürün seçiniz...</option>
                                <option v-for="product in products" :value="product.id" :key="product.id" :disabled="product.adet-product.satisAdeti < 0">
                                {{product.urunadi}}
                                </option>
                            </select>
                        </div>
                        <div class="card mb-2 border border-danger">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-12 text-center" v-if="products[selectedProduct]">
                                        <div class="mb-3">
                                                <span class="badge badge-info">Stok : {{products[selectedProduct].adet- products[selectedProduct].satisAdeti}}</span>
                                            <span class="badge badge-primary">Fiyat : {{products[selectedProduct].fiyat | currency}}</span>
                                        </div>
                                        <p class="border border-warning p-2 text-secondary">{{products[selectedProduct].aciklama}}</p>
                                    </div>
                                    <div class="col-12 text-center" v-else>
                                        <div class="mb-3">
                                            <span class="badge badge-info">Stok : <br><br></span>
                                            <span class="badge badge-primary">Fiyat : <br><br></span>
                                        </div>
                                        <p class="border border-warning p-2 text-secondary"><br><br></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="frmg">
                            <label>Adet</label>
                            <input type="number" class="fc" placeholder="Ürün adetini giriniz.." v-model="count" required>
                            <label>Satış Fiyatı</label>
                            <input type="number" class="fc" placeholder="Ürün satış fiyatını giriniz.." v-model="price"required>
                        </div>
                        <hr>
                        <button class="btn btn-primary" type='submit' @click.prevent="updateProds">Kaydet</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</template>

<script>
    import {mapGetters} from "vuex";
    export default {
        data(){
            return{
                selectedProduct: 0,
                count: '',
                price: '',
            }
        },
        computed:{
            ...mapGetters(
                {products: "getProducts"})
        },
        methods:{
          updateProds(){
              if(this.count > 0 && this.price > 0){
                  console.log(this.products[this.selectedProduct])
                  this.products[this.selectedProduct].satisAdeti = this.count;
                  this.products[this.selectedProduct].satisFiyati = this.price;
                  this.$store.dispatch('updateDBProds', this.products[this.selectedProduct])
              }else{
                  alert('Lütfen geçerli bir adet  veya fiyat giriniz!!')
              }
          },
        },
        watch:{
            count(){
                if((this.products[this.selectedProduct].adet -this.products[this.selectedProduct].satisAdeti) < this.count){
                    this.count = 0;
                }
            }
        }
    }
</script>

<style scoped>
    .border-danger {
        border-style: dashed !important;
    }
    .kucult{
        position: relative;
        width: 100%;
        padding-right: 15px;
        padding-left: 15px;
        -ms-flex: 0 0 50%;
        flex: 0 0 50%;
        max-width: 50%;
        margin-left: 25%;
        padding-top: 1rem;
        margin-top: 3rem
    }
    .frmg {
        margin-bottom: 1rem;
    }
    .fc {
        display: block;
        width: 100%;
        height: calc(1.5em + 0.75rem + 2px);
        padding: 0.375rem 0.75rem;
        font-size: 1rem;
        font-weight: 400;
        line-height: 1.5;
        color: #495057;
        background-color: #fff;
        background-clip: padding-box;
        border: 1px solid #ced4da;
        border-radius: 0.25rem;
        transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
    }
</style>
