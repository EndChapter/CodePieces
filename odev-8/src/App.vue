<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <br>
                <button @click="selectedComponent = 'appBlue'" class="btn btn-primary">Mavi Temayı Yükle</button>
                <button @click="selectedComponent = 'appGreen'" class="btn btn-success">Yeşil Temayı Yükle</button>
                <button @click="selectedComponent = 'appRed'" class="btn btn-danger">Kırmızı Temayı Yükle </button>
                <hr>
              <keep-alive>
                <component :is="selectedComponent">
                  <h1 slot="red">Bu birinci componentin yazısı</h1>
                  <h1 slot="green">Bu ikinci componentin yazısı</h1>
                  <h1 slot="blue">Bu üçüncü componentin yazısı</h1>

                </component>
              </keep-alive>

<!--                <app-blue></app-blue>-->
<!--                <app-green></app-green>-->
<!--                <app-red></app-red>-->
            </div>
        </div>
    </div>
</template>

<script>
    import Blue from './components/Blue.vue';
    import Green from './components/Green.vue';
    import Red from './components/Red.vue';

    export default {
        data: function(){
          return{
            selectedComponent : "appBlue",
          }
        },
        components: {
            appBlue: Blue,
            appGreen: Green,
            appRed: Red
        }
    }
</script>

<style>
</style>
