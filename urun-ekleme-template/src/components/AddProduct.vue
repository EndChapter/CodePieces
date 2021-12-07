<template>
    <div class="col-md-5">
        <div class="col-md-11 card">
            <div class="card-body">
                <div class="form-group">
                    <label>Ürün Adı</label>
                    <input type="text" class="form-control" placeholder="adını giriniz" v-model = "appProductName">
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <label>Ürün Adeti</label>
                        <input type="text" class="form-control" placeholder="adetini giriniz" v-model = "appProductNumber">
                    </div>
                    <div class="form-group col-md-6">
                        <label>Ürün Fiyatı</label>
                        <input type="text" class="form-control" placeholder="fiyatını giriniz" v-model = "appProductPrice">
                    </div>
                </div>
                <button class="btn btn-outline-info btn-block" @click="addProduct">Ekle!</button>
            </div>
        </div>
    </div>
</template>

<script>
    import {eventBus} from "../main";

    export default {

        props : ['product'],
        data: function(){
          return{
              appProductName : "",
              appProductNumber : "",
              appProductPrice : "",
              appProductId: 1,
              appImageUrl: ""
          }
        },
        methods : {
            addProduct(){
                    if(this.product.length < 10)
                        this.product.push({id: this.appProductId++, productName: this.appProductName, productNumber: this.appProductNumber, productPrice: this.appProductPrice, productImgUrl: this.appImageUrl});
                    else
                        alert('Daha Fazla Ürün Ekleyemezsiniz!!')
            }

            },
        created() {
            eventBus.$on('data', (data)=>{
                this.appImageUrl = data;
            })
        }
    }
</script>

<style scoped>

</style>