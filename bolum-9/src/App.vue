<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 offset-md-3">
        <br><br>
        <button @click="selectedComponent = 'appMemory'" class="btn-sm btn-primary">AppMemory</button>
        <button @click="selectedComponent = 'appNewMemory'" class="btn-sm btn-primary">AppNewMemory</button>
        <button @click="selectedComponent = 'appAuthor'" class="btn-sm btn-primary">AppAuthor</button>
        <hr>
        <p>{{selectedComponent}}</p>
        <hr>
        <component :is="selectedComponent">
          <h1 slot="heading">Güzel Bir Gün...</h1>
          <p>Bu Çok Güzel Bir Anıydı..</p>
        </component>
<!--        <app-memory>-->
<!--          <h1 slot="heading">Güzel Bir Gün...</h1>-->
<!--          <p>Bu Çok Güzel Bir Anıydı..</p>-->
<!--        </app-memory>-->
      </div>

    </div>

  </div>

</template>

<script>

import Memory from "./components/Memory";
import NewMemory from "./components/NewMemory";
import Author from "./Author";

export default {
  data : function(){
    return{
      selectedComponent : "appMemory"
    }
  },
  components:{
    appMemory : Memory,
    appNewMemory : NewMemory,
    appAuthor : Author
  },
}
</script>


